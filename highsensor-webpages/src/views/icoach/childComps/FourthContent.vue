<template>
  <div class="fourth-wrapper">
    <div class="left-title">
      <div class="left-content-zh">自助扫码 · 训练计费</div>
      <div class="left-content-en">&nbsp;&nbsp;SELF-SERVICE PAYMENT</div>
    </div>
    <div class="center-iphone">
      <div class="iphone">
        <div class="iphone-shell">
          <img src="@/assets/img/icoach/IPhoneXPage2.png" alt />
        </div>
        <swiper class="swiper-iphone" :options="swiperOptionPhone" ref="swiperIphone">
          <swiper-slide v-for="(item, index) in dataInfo.phones" :key="item.id">
            <img :src="item.image" alt />
          </swiper-slide>
          <!-- <div class="swiper-button-next phone-button" slot="button-next" style="width: 319px;"></div> -->
        </swiper>
      </div>
    </div>
    <div class="center-iphone-right-wrapper">
      <div class="center-iphone-right">
        <div
          class="swiper-button-next left-circular swiper-button-black"
          role="button"
          aria-label="Next slide"
        >
          <!-- <i class="fas fa-chevron-right"></i> -->
        </div>
        <div class="left-woman">
          <img src="@/assets/img/icoach/woman.png" alt />
        </div>
      </div>
    </div>

    <div class="iphone-text-wrapper">
      <div class="iphone-text-display1" v-show="1 === iphoneIndex">
        <div class="title">
          <p class="title-zh">智能教练</p>
          <p class="title-en">AI ROBOT COACH</p>
        </div>
        <div class="text-info">
          智能教学+智能评判双引擎
          <br />自助扫码发车训练支付计费
          <br />「小酷小酷」智能语音识别
        </div>
      </div>
      <div class="iphone-text-display2" v-show="2 === iphoneIndex">
        <div class="title">
          <p class="title-zh">最新题库</p>
          <p class="title-en">EXAM POOL & TOPIC</p>
        </div>
        <div class="text-info">
          模拟考试&nbsp;&nbsp;随机练习&nbsp;&nbsp;专项练习
          <br />我的错题&nbsp;&nbsp;图标速记&nbsp;&nbsp;我的收藏
          <br />过关秘籍&nbsp;&nbsp;考试要点&nbsp;&nbsp;规则流程
          <br />
考试标准&nbsp;&nbsp;基础操作&nbsp;&nbsp;驾驶实践
        </div>
      </div>
      <div class="iphone-text-display3" v-show="0 === iphoneIndex">
        <div class="title">
          <p class="title-zh">高精定位</p>
          <p class="title-en">HIGH ACCURACY GNSS</p>
        </div>
        <div class="text-info">
          厘米级高精度卫星差分定位
          <br />智能远程辅助刹车（选配）
          <br />
零馈线一体化设计专利技术
        </div>
      </div>
    </div>
    <div class="fourth-right-cloud">
      <div class="cloud-img">
        <img src="@/assets/img/icoach/icocloud.png" alt />
      </div>
    </div>
  </div>
</template>

<script>
import { Swiper, SwiperSlide } from "vue-awesome-swiper";
import "swiper/css/swiper.css";
export default {
  name: "FourthContent",
  components: {
    Swiper,
    SwiperSlide
  },
  props: {
    dataInfo: {
      type: Object,
      default() {
        return {};
      }
    }
  },
  data() {
    const self = this;
    return {
      iphoneIndex: 1,
      swiperOptionPhone: {
        speed: 500,
        spaceBetween: -4,
        loop: true,
        navigation: {
          nextEl: ".swiper-button-next.left-circular"
        },
        on: {
          slideChange() {
            self.iphoneIndex = this.activeIndex % 3;
          }
        },
        autoplay: true
      },
      swiperOptionPhoneMessage: {
        effect: "fade", //切换效果
        speed: 1000,
        slidesPerView: 5,
        spaceBetween: 10,
        loop: true,
        navigation: {
          nextEl: ".swiper-button-next.phone-button"
        }
        // autoplay: true
      }
    };
  },
  computed: {},
  created() {},
  methods: {
    isShow(index) {
      console.log(index);

      return this.iphoneIndex === index;
    }
  }
};
</script>

<style lang="less">
.fourth-wrapper {
  // display: flex;
  position: relative;
  height: 947px;
  .left-title {
    float: left;
    width: 17.8073%;
    height: 100%;
    padding-top: 4vmax;
    .left-content-zh {
      font-size: 26.3056px;
      font-family: AlibabaPuHuiTiR;
      font-weight: 400;
      width: 100%;
      text-align: right;
      height: 1.6vw;
    }
    .left-content-en {
      font-size: 10.5222px;
      font-family: AlibabaPuHuiTiR;
      font-weight: 400;
      width: 100%;
      text-align: right;
      line-height: 30px;
    }
  }

  .center-iphone {
    // background-color: #bfa;
    position: absolute;
    width: 24.15%;
    margin-left: 25%;
    float: left;
    .iphone {
      height: 947px;
      // width: 22.4vw;
      width: 24.15%;
      margin: 0 auto;
      padding-top: 3vmax;
      position: relative;
      .iphone-shell {
        position: absolute;
        width: 100%;
        z-index: 4;
        margin-top: 59px;
        margin-left: -329px;
        // margin-right: 100px;
        left: 0;
        right: 0;
        top: 0;
        bottom: 0;
        img {
          height: 100%;
        }
      }
      .swiper-iphone {
        margin-top: 105px;
        height: 770px;
        position: absolute;
        width: 360px;
        margin-left: 0;
        left: -255px;
        right: 0;
        top: 0;
        bottom: 0;
        img {
          height: 100%;
        }
      }
    }
  }
  .center-iphone-right-wrapper {
    position: absolute;
    margin-left: 45%;
    width: 16.1458%;
    float: left;
    // background-color: red;
    .center-iphone-right {
      height: 947px;
      // height: 50vw;
      margin: 0 auto;
      position: relative;
      .left-circular {
        outline:none;
        width: 4.1666vw;
        height: 4.1666vw;
        position: absolute;
        border-radius: 2.0833vw;
        top: 9.5833vw;
        margin-top: 9.5833vw;
        border: 0.3125em solid rgba(255, 227, 0, 1);
        text-align: center;
        line-height: 3.4666vw;
        left: 0;
        // i {
        //   font-size: 30px;
        //   line-height: 3.4666vw;
        //   font-style: normal;
        //   color: #333333;
        // }
      }
      .left-woman {
        position: absolute;
        border-bottom: 100px;
        width: 7.3vw;
        left: 3vw;
        // top: 0;
        margin-left: 3vw;
        bottom: 0;
        // margin-bottom: 0;
        img {
          width: 100%;
          height: 100%;
        }
      }
    }
  }

  .iphone-text-wrapper {
    float: left;
    position: absolute;
    top: 5.333vmax;
    right: 20%;
    .iphone-text-display1 {
      .title {
        padding-top: 8vmax;
        text-align: left;
        .title-zh {
          font-size: 2.5vw;
          font-family: AlibabaPuHuiTiR;
          font-weight: bold;
          color: rgba(69, 189, 100, 1);
          padding-left: 3vmax;
          padding-right: 3vmax;
          margin-bottom: 20px;
        }
        .title-en {
          font-size: 1vw;
          font-family: AlibabaPuHuiTiR;
          font-weight: 400;
          color: rgba(168, 168, 168, 1);
          padding-left: 3vmax;
          padding-right: 3vmax;
        }
      }
      .text-info {
        font-size: 1.2vw;
        font-family: AlibabaPuHuiTiR;
        font-weight: 400;
        color: rgba(102, 102, 102, 1);
        text-align: left;
        padding-left: 3vmax;
        padding-right: 0vmax;
        padding-top: 3.5vmax;
        line-height: 3vw;
      }
    }

    .iphone-text-display2 {
      .title {
        padding-top: 8vmax;
        text-align: left;
        .title-zh {
          font-size: 2.5vw;
          font-family: AlibabaPuHuiTiR;
          font-weight: bold;
          color: rgba(252, 189, 60, 1);
          padding-left: 3vmax;
          padding-right: 3vmax;
          margin-bottom: 20px;
        }
        .title-en {
          font-size: 1vw;
          font-family: AlibabaPuHuiTiR;
          font-weight: 400;
          color: rgba(168, 168, 168, 1);
          padding-left: 3vmax;
          padding-right: 3vmax;
        }
      }
      .text-info {
        font-size: 1.2vw;
        font-family: AlibabaPuHuiTiR;
        font-weight: 400;
        color: rgba(102, 102, 102, 1);
        text-align: left;
        padding-left: 3vmax;
        padding-right: 0vmax;
        padding-top: 3.5vmax;
        line-height: 3vw;
      }
    }

    .iphone-text-display3 {
      .title {
        padding-top: 8vmax;
        text-align: left;
        .title-zh {
          font-size: 2.5vw;
          font-family: AlibabaPuHuiTiR;
          font-weight: bold;
          color: rgba(232,65,108,1);
          padding-left: 3vmax;
          padding-right: 3vmax;
          margin-bottom: 20px;
        }
        .title-en {
          font-size: 1vw;
          font-family: AlibabaPuHuiTiR;
          font-weight: 400;
          color: rgba(168, 168, 168, 1);
          padding-left: 3vmax;
          padding-right: 3vmax;
        }
      }
      .text-info {
        font-size: 1.2vw;
        font-family: AlibabaPuHuiTiR;
        font-weight: 400;
        color: rgba(102, 102, 102, 1);
        text-align: left;
        padding-left: 3vmax;
        padding-right: 0vmax;
        padding-top: 3.5vmax;
        line-height: 3vw;
      }
    }
  }

  .fourth-right-cloud {
    float: left;
    position: absolute;
    right: 0;
    top: 5.333vmax;
  }
}
</style>