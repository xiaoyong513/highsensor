<template>
  <div class="seventh-content-wrapper">
    <div class="left-content">
      <div class="left-content-zh">高精定位 · 毫厘误差</div>
      <div class="left-content-en">&nbsp;&nbsp; HIGH ACCURACY RTK-GNSS</div>
    </div>

    <div class="center-img">
      <div class="center-car-img">
        <img src="@/assets/img/icoach/car6.gif" alt />
      </div>
    </div>
    <div class="right-text">
      <!-- <div class="text-title">
        高森感应&nbsp;
        <i class="fa fa-handshake"></i>
        &nbsp;北京思凌
      </div> -->
      <div class="text-color-div"></div>
      <div
        class="text-content"
      >融合厘米级高精度全球卫星差分定位（GPS、GLONASS、Galileo、北斗）、云计算、移动APP、AI+物联网&nbsp;&nbsp;专业智能驾考量身打造</div>
    </div>
  </div>
</template>

<script>
export default {
  name: "SeventhContent",
  components: {},
  data() {
    return {};
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style lang="less">
.seventh-content-wrapper {
  position: relative;
  height: 947px;
  // background-color: #bfa;
  .left-content {
    float: left;
    width: 17.8073%;
    height: 100%;
    padding-top: 4vmax;
    // text-align: left;
    .left-content-zh {
      font-family: AlibabaPuHuiTiR;
      font-size: 26.3056px;
      font-weight: 400;
      width: 100%;
      text-align: right;
      color: #333;
      height: 1.6vw;
    }
    .left-content-en {
      font-family: AlibabaPuHuiTiR;
      font-weight: 400;
      width: 100%;
      text-align: right;
      color: #a8a8a8;
      line-height: 30px;
      font-size: 6.01111px;
    }
  }

  .center-img {
    float: left;
    width: 63.4583%;
    .center-car-img {
      width: 39.6vw;
      margin: 0 auto;
      left: 0;
      padding-top: 5vw;
      img {
        width: 100%;
        height: 100%;
      }
    }
  }
  .right-text {
    width: 480px;
    position: absolute;
    right: 400px;
    top: 580px;
    // background-color: #bfa;
    .text-title {
      font-size: 2vw;
      font-family: AlibabaPuHuiTiR;
      font-weight: 400;
      color: rgba(102, 102, 102, 1);
      text-align: left;
      padding-top: 1.8vw;
      padding-left: 0.6vw;
      position: absolute;
      z-index: 4;
    }
    .text-color-div {
      
      width: 10vw;
      height: 1vw;
      position: absolute;
      top: 3.6vw;
      right: 15vw;
      background-color: #ffe300;
    }
    .text-content {
      font-size: 1.2vw;
      font-family: AlibabaPuHuiTiR;
      font-weight: 400;
      color: rgba(102, 102, 102, 1);
      text-align: left;
      padding-top: 5.6vw;
      line-height: 2vw;
    }
  }
}
</style>