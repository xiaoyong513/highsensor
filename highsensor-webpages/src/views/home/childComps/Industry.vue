<template>
  <div class="industry-wrapper">
    <div class="container">
      <!-- 大标题 -->
      <h3 class="comm-title">{{industry.name}}</h3>
      <!-- 描述文字 -->
      <p
        class="comm-info"
      >{{industry.info}}</p>
    </div>
    <div class="industry-list-wrapper">
      <ul class="industry-list clearfix">
        <li v-for="item in industry.collection" :key="item.id" class="industry-item" @click="goToInfo(item.router)">
          <img :src="item.image" alt />
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "Industry",
  components: {},
  props: {
    industry: {
      type: Object,
      default() {
        return {};
      }
    }
  },
  computed: {},
  created() {
    
  },
  methods: {
    goToInfo(router) {
      this.$router.replace(router)
    }
  }
};
</script>

<style lang='less' scoped>
// 经营产业
.industry-wrapper {
  //背景颜色
  background: #022266;
  // 标题以及内容
  .container {
    padding-top: 70px;
    text-align: center;
    // 标题
    .comm-title {
      font-size: 36px;
      color: white;
      font-weight: 30;
      &::after {
        display: block;
        content: "";
        width: 80px;
        height: 5px;
        margin: 25px auto 0;
        background-color: #fff;
      }
    }
    // 内容
    .comm-info {
      text-align: center;
      font-size: 16px;
      color: #ffffff;
      line-height: 150%;
      margin: 10px auto;
    }
  }
  // 产业列表
  .industry-list-wrapper {
    background-color: #fff;
    ul {
      display: block;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0px;
      margin-inline-end: 0px;
      padding-inline-start: 40px;
    }
    li {
      display: list-item;
      text-align: -webkit-match-parent;
    }
    .industry-list {
      overflow: hidden;
      // height: 764px;
      margin: 0;
      padding: 0;
      list-style: none;
      li {
        // padding: 0;
        float: left;
        overflow: hidden;
        position: relative;
        // transition: width 455ms;
        width: 33.33333%;
        img {
          transition: 0.2s;
          width: 100%;
        }
        &:hover {
          img {
            transform: scale(1.2);
          }
        }
      }
    }
  }
}
</style>