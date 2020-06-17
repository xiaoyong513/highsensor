<template>
  <div class="product-info-list-wrapper">
    <div class="proudct-group-wrapper">
      <div class="group-list">
        <ul>
          <li class="group-all">
            <span>全部</span>
          </li>
          <li class="group-tile">
            <span>定位</span>
          </li>
          <li class="group-tile">
            <span>测距</span>
          </li>
          <li class="group-tile">
            <span>信号采集</span>
          </li>
          <li class="group-tile">
            <span>无线</span>
          </li>
          <li class="group-tile">
            <span>其他</span>
          </li>
        </ul>
      </div>
    </div>
    <div class="product-info-list">
      <ul>
        <li>配件</li>
        <li>配件</li>
        <li>配件</li>
        <li>配件</li>
        <li>配件</li>
        <li>配件</li>
        <li>配件</li>
        <li>配件</li>
        <li>配件</li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "ProductList",
  components: {},
  props: {
    productList: {
      type: Object,
      default() {
        return {};
      }
    }
  },
  data() {
    return {};
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style lang="less">
.product-info-list-wrapper {
  background-color: #f9f9f9;
  height: 947px;
  display: flex;
  .proudct-group-wrapper {
    position: relative;
    width: 20%;
    background-color: red;
    .group-list {
      position: absolute;
      text-align: center;
      margin: 0 auto;
      left: 0;
      .group-all {
        text-align: left;
      }
      li {
        line-height: 30px;
        text-align: left;
        span {
        }
      }
    }
  }
  .product-info-list {
  }
}
</style>