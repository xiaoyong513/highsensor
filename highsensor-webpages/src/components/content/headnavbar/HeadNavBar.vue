<template>
  <div class="head-nav-bar-wrapper">
    <div class="head-nav-bar">
      <tab-bar>
        <logo />
        <tab-bar-item path="/home" activeColor="#203fbb">
          <span slot="item-text">网站首页</span>
        </tab-bar-item>
        <tab-bar-item path="/icoach" activeColor="#203fbb">
          <span slot="item-text">小酷云驾考</span>
        </tab-bar-item>
        <tab-bar-item path="/solution" activeColor="#203fbb">
          <span slot="item-text">解决方案</span>
        </tab-bar-item>
        <!-- <tab-bar-item path="/product" activeColor="#203fbb">
          <span slot="item-text">产品中心</span>
        </tab-bar-item> -->
        <tab-bar-item path="/contact" activeColor="#203fbb">
          <span slot="item-text">联系我们</span>
        </tab-bar-item>
        <div class="nav-search">
          <input type="text" class="input-search" name="searchWord" value placeholder="请输入搜索关键词!" />
          <button type="submit" class="input-search-bt">
            <i></i>
          </button>
        </div>
      </tab-bar>
    </div>
  </div>
</template>

<script>
import TabBar from "@/components/common/tabbar/TabBar";
import TabBarItem from "@/components/common/tabbar/TabBarItem";
import Logo from "./Logo";
export default {
  name: "HeadNavBar",
  components: {
    TabBar,
    TabBarItem,
    Logo
  },
  data() {
    return {};
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style scoped>
.head-nav-bar-wrapper {
  position: sticky;
  position: -webkit-sticky;
  top: 0;
  left: 0;
  background-color: #fff;
  /* height: 100px; */
  width: 100%;
  box-shadow: 0 2px 3px rgba(7, 0, 2, 0.04);
  z-index: 9999;
}
.nav-search {
  position: relative;
  margin-left: 50px;
  width: 149px;
  height: 25px;
  margin-top: 5px;
  float: left;
}
.nav-search .input-search {
  float: left;
  font-size: 13px;
  height: 25px;
  width: 130px;
  border-radius: 5px;
  outline: none;
  border: 1px solid #ccc;
  padding-left: 9px;
}
.nav-search .input-search-bt {
  float: left;
  width: 19px;
  height: 25px;
  border: none;
  outline: none;
  cursor: pointer;
  background-color: #fff;
  border: 1px solid transparent;
}

.nav-search .input-search-bt i {
  content: url("../../../assets/img/common/search.png");
  width: 16px;
  margin-top: 4px;
  margin-left: 2px;
}
</style>