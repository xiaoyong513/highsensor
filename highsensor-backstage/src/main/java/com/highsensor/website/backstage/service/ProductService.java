package com.highsensor.website.backstage.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.highsensor.website.backstage.entity.Product;
import com.highsensor.website.backstage.entity.dto.product.ProductDTO;
import com.highsensor.website.backstage.entity.query.QueryProduct;
import com.highsensor.website.backstage.entity.vo.ProductVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author changyong
 * @since 2020-06-17
 */
public interface ProductService extends IService<Product> {

    void createProduct(ProductDTO productDTO);

    void getProductList(Page<Product> industryPage, QueryProduct queryProduct);

    List<ProductVO> getProductList(long page, long limit, QueryProduct queryProduct);

    List<ProductVO> getProductList(long page, long limit);

    List<ProductVO> getProductList(QueryProduct queryProduct);

    List<ProductVO> getProductList();

}
