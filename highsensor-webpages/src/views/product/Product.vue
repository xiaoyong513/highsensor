<template>
  <div class="product">
    <div class="first-content">
      <div class="first-img">
        <img src="@/assets/img/contact/联系我们.png" alt />
      </div>
    </div>

    <product-list :productList="productList"></product-list>
  </div>
</template>

<script>
import ProductList from "./childComps/ProductList";
export default {
  name: "Product",
  components: {
    ProductList
  },
  data() {
    return {
      productList: {}
    };
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style lang="less">
.product {
  .first-content {
    background-color: #fff;
    margin-bottom: 60px;
    .first-img {
      img {
        width: 100%;
      }
    }
  }
}
</style>