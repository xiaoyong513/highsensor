package com.highsensor.website.backstage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.highsensor.website.backstage.entity.Product;
import com.highsensor.website.backstage.entity.dto.product.ProductDTO;
import com.highsensor.website.backstage.entity.query.QueryProduct;
import com.highsensor.website.backstage.entity.vo.ProductVO;
import com.highsensor.website.backstage.mapper.ProductMapper;
import com.highsensor.website.backstage.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author changyong
 * @since 2020-06-17
 */
@Service
@Slf4j
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Override
    public void createProduct(ProductDTO productDTO) {
        Product product = new Product();
        BeanUtils.copyProperties(productDTO, product);
        int insert = baseMapper.insert(product);
        log.info("[添加产品] 成功,result:{}", insert);
    }

    @Override
    public void getProductList(Page<Product> industryPage, QueryProduct queryProduct) {
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        if (queryProduct == null) {
            queryWrapper.orderByAsc("sort", "modified_time");
            baseMapper.selectPage(industryPage, queryWrapper);
            return;
        }

        if (StringUtils.isNotBlank(queryProduct.getTitle())) {
            queryWrapper.like("title", queryProduct.getTitle());
        }
        if (queryProduct != null) {
            queryWrapper.eq("is_show", queryProduct.getIsShow());
        }
        queryWrapper.orderByAsc("sort", "modified_time");
        baseMapper.selectPage(industryPage, queryWrapper);
    }

    @Override
    public List<ProductVO> getProductList(long page, long limit, QueryProduct queryProduct) {
        Page<Product> industryPage = new Page<>(page, limit);
        getProductList(industryPage, queryProduct);
        List<Product> records = industryPage.getRecords();
        List<ProductVO> collect = records.parallelStream().map(e -> new ProductVO(e)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<ProductVO> getProductList(long page, long limit) {
        QueryProduct queryProduct = new QueryProduct();
        queryProduct.setIsShow(true);
        return getProductList(page, limit, queryProduct);
    }

    @Override
    public List<ProductVO> getProductList(QueryProduct queryProduct) {
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("sort", "modified_time");
        List<Product> Industries;
        if (queryProduct != null) {
            if (StringUtils.isNotBlank(queryProduct.getTitle())) {
                queryWrapper.like("title", queryProduct.getTitle());
            }
            if (queryProduct != null) {
                queryWrapper.eq("is_show", queryProduct.getIsShow());
            }
        }
        Industries = baseMapper.selectList(queryWrapper);
        List<ProductVO> collect = Industries.parallelStream().map(e -> new ProductVO(e)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<ProductVO> getProductList() {
        QueryProduct queryProduct = new QueryProduct();
        queryProduct.setIsShow(true);
        return getProductList(queryProduct);
    }
}
