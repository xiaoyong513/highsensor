<template>
  <div class="product-list-wrapper">
    <div class="product-list-title">
      <h2 class="comm-title">{{product.name}}</h2>
    </div>

    <div class="product-list">
      <swiper class="swiper1" :options="swiperOption" ref="productSwiper">
        <swiper-slide v-for="(item, index) in product.collection" :key="item.id">
          <div class="product-wrapper">
            <div class="product-img">
              <img :src="item.image" alt />
            </div>
            <div class="product-text">
              <h2 class="product-title">
                <a href="#">
                  <b>{{index + 1}}</b>
                  <span>{{item.title}}</span>
                </a>
              </h2>
              <h3 class="product-info">
                <p>{{item.info}}</p>
              </h3>
            </div>
          </div>
        </swiper-slide>
        <!-- <div class="swiper-pagination" slot="pagination"></div> -->
      </swiper>
      <div class="swiper-button-prev home-product-prev" slot="button-prev"></div>
      <div class="swiper-button-next home-product-next" slot="button-next"></div>
      <official-accounts-dialog
        v-model="isShow"
        title="扫一扫"
        content="想了解详细内容,请扫码关注公众号"
        v-on:cancel="clickCancel()"
        @danger="clickDanger()"
        @confirm="clickConfirm()"
      />
    </div>
  </div>
</template>

<script>
import { Swiper, SwiperSlide } from "vue-awesome-swiper";
import "swiper/css/swiper.css";
import OfficialAccountsDialog from "./OfficialAccountsDialog";
let vm = null;
export default {
  name: "ProductList",
  components: {
    Swiper,
    SwiperSlide,
    OfficialAccountsDialog
  },
  props: {
    product: {
      type: Object,
      default() {
        return {}
      }
    }
  },
  data() {
    return {
      swiperOption: {
        // effect: "fade", //切换效果
        // effect: "cube",
        // speed: 10,
        // observer: true,
        // observeParents:true,
        slidesPerView: 3,
        centeredSlides: true,
        centeredSlidesBounds: true,
        spaceBetween: 30,
        loop: true,
        loopedSlides: 5,
        slideToClickedSlide: true,
        preventClicksPropagation: true,
        pagination: {
          // el: ".swiper-pagination",
          // clickable: true,
          // dynamicBullets: true
          // type: "progressbar"
          // progressbarOpposite: true,
          // progressbarFillClass : 'my-pagination-progressbar-fill',
        },
        navigation: {
          nextEl: ".swiper-button-next.home-product-next",
          prevEl: ".swiper-button-prev.home-product-prev"
        },
        // autoplay: true,
        direction: "vertical",
        on: {
          click: function(e) {
            const realIndex = this.realIndex;
            vm.showOfficialAccountsDialog(); //要执行函数
          }
        }
      },
      isShow: false
    };
  },
  computed: {
  },
  created() {
    vm = this;
  },
  methods: {
    showOfficialAccountsDialog() {
      this.isShow = true;
    },
    clickCancel() {
      // console.log("点击了取消");
    },
    clickDanger() {
      // console.log("这里是danger回调");
    },
    clickConfirm() {
      // console.log("点击了confirm");
    }
  }
};
</script >
<style lang="less">
.product-list-wrapper {
  background: url("../../../assets/img/home/bg/beijing002.jpg");
  background-position: center;
  position: relative;
  background-size: cover;
  padding-top: 80px;
  .product-list-title {
    font-size: 30px;
    position: absolute;
    left: 0px;
    top: 50%;
    max-width: 170px;
    padding-left: 20px;
    transform: translateY(-50%);
    color: rgb(255, 255, 255);
    .comm-title {
      font-size: 36px;
      color: white;
      font-weight: 30;
      &::after {
        display: block;
        content: "";
        width: 160px;
        height: 2px;
        margin: 25px auto 0;
        background-color: #fff;
      }
    }
  }
  .product-list {
    max-width: 80vw;
    margin-right: auto;
    margin-left: auto;
    padding-right: 0.9375rem;
    padding-left: 50px;
    position: relative;
    height: 840px;
    .swiper1 {
      height: 800px;
      padding-left: 50px;
      .swiper-slide {
        .product-wrapper {
          display: flex;
          .product-img {
            z-index: 2;
            img {
              opacity: 0.4;
              transition: 1.5s 0.2s;
              width: 440px;
            }
          }
          .product-text {
            display: block;
            margin: 30px auto;
            padding-top: 30px;
            padding-left: 50px;
            // background-color: #0069bf;
            // transition: 3s;
            opacity: 0.4;
            flex-flow: column;
            justify-content: space-evenly;
            color: #ffffff;
            .product-title {
              a {
                color: #ffffff;
                font-size: 20px;
              }
              font-weight: 30;
              // transition-delay: 0.35s;
              // transform: translateY(-10px);
              b {
                font-size: 42px;
                font-weight: bold;
                margin-right: 45px;
                position: relative;
                top: 7px;
                &::after {
                  content: "";
                  display: block;
                  width: 15px;
                  height: 2px;
                  background: #ffffff;
                  position: absolute;
                  right: -30px;
                  top: 50%;
                  margin-top: -1px;
                  transition: ease 0.65s;
                }
              }
            }
            .product-info {
              padding-top: 10px;
              padding-left: 40px;
              color: #ffffff;
              transition-delay: 0.45s;
              transform: translateY(-10px);
              p {
                font-size: 14px;
                font-weight: 30;
                line-height: 150%;
              }
            }
          }
        }
      }

      .swiper-slide-active {
        .product-wrapper {
          .product-img {
            img {
              opacity: 1;
              transform: scale(1.2);
              overflow: hidden;
            }
            z-index: 6;
          }
          .product-text {
            background: rgb(0, 105, 191);
            opacity: 1;
            transition: 3s;
          }
        }
      }
    }
    .home-product-next,
    .home-product-prev {
      --swiper-navigation-size: 20px;
      outline: none;
      width: 2.5666vw;
      height: 2.5666vw;
      position: absolute;
      border-radius: 2.0833vw;
      border: 0.1125em solid rgba(255, 255, 255, 0.4);
      text-align: center;
      line-height: 1.4666vw;
      position: absolute;
      color: rgba(255, 255, 255, 0.4);
      &:hover {
        border: 0.1125em solid rgba(255, 255, 255, 1);
        color: rgba(255, 255, 255, 1);
      }
    }
    .home-product-next {
      right: 1.5vw;
      transform: rotateZ(0.25turn);
      top: 55%;
    }
    .home-product-prev {
      right: 0;
      left: auto;
      margin-right: 1.5vw;
      transform: rotateZ(0.25turn);
      top: 40%;
    }
  }
}

// .swiper-container {
//   // --swiper-theme-color: #ff6600;/* 设置Swiper风格 */
//   --swiper-navigation-color: #00ff33; /* 单独设置按钮颜色 */
//   --swiper-navigation-size: 30px; /* 设置按钮大小 */
// }
</style>