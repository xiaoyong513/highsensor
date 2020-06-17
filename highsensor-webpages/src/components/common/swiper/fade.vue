<template>
  <div>
    <swiper class="swiper gallery-top" :options="swiperOptionTop" ref="swiperTop">
      <swiper-slide class="slide-1">
        <img src="@/assets/img/home/swiper/swiper01.jpg" />
      </swiper-slide>
      <swiper-slide class="slide-2">
        <img src="@/assets/img/home/swiper/swiper02.jpg" />
      </swiper-slide>
      <div class="swiper-pagination swiper-pagination-white" slot="pagination"></div>
      <div class="swiper-button-next-wrapper"></div>
      <div class="swiper-button-next swiper-button-white" slot="button-next"></div>
      <div class="swiper-button-prev-wrapper">
      </div>
        <div class="swiper-button-prev swiper-button-white" slot="button-prev"></div>
    </swiper>
    <!-- swiper2 Thumbs -->
    <!-- <swiper class="swiper gallery-thumbs" :options="swiperOptionThumbs" ref="swiperThumbs">
      <swiper-slide class="slide-1">
        <img src="@/assets/img/home/swiper/swiper01.jpg" />
      </swiper-slide>
      <swiper-slide class="slide-2">
        <img src="@/assets/img/home/swiper/swiper02.jpg" />
      </swiper-slide>
      <swiper-slide class="slide-3">
        <img src="@/assets/img/home/swiper/swiper03.jpg" />
      </swiper-slide>
    </swiper> -->
  </div>
</template>
<script>
import { Swiper, SwiperSlide } from "vue-awesome-swiper";
import "swiper/css/swiper.css";
export default {
  name: "fade",
  title: "Fade effect",
  components: {
    Swiper,
    SwiperSlide
  },
  data() {
    return {
      swiperOptionTop: {
        loop: true,
        speed: 2000,
        effect: "fade", //切换效果
        // grabCursor: true, //设置为true时，鼠标覆盖Swiper时指针会变成手掌形状
        loopedSlides: 5, // looped slides should be the same
        spaceBetween: 30, // 轮播图之间的间距
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev"
        },
        centeredSlides: true,
        pagination: {
          el: ".swiper-pagination",
          clickable: true
        },
        autoplay: true,
        // slidesPerView: "auto"
      },
      swiperOptionThumbs: {
        loopedSlides: 10, // looped slides should be the same
        spaceBetween: 15,
        centeredSlides: true,
        slidesPerView: "auto",
        touchRatio: 0.2,
        slideToClickedSlide: true
      }
    };
  },
  mounted() {
    this.$nextTick(() => {
      const swiperTop = this.$refs.swiperTop.$swiper;
      const swiperThumbs = this.$refs.swiperThumbs.$swiper;
      swiperTop.controller.control = swiperThumbs;
      swiperThumbs.controller.control = swiperTop;
    });
  }
};
</script>

<style lang="scss" scoped>
.swiper-slide {
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
  font-weight: bold;
  background-color: white;
}
.gallery-top {
  // height: 800px;
  position: relative;
  .swiper-slide {
    background-position: center;
    background-size: cover;
    // padding-left: 14px;
  }

  .swiper-button-next-wrapper {
    // position: absolute;
    top: 0;
    right: 0;
    width: 280px;
    height: 100%;
    border-left: none;
    background-image: linear-gradient(
      to right,
      rgb(255, 255, 255),
      rgb(0, 0, 0)
    );
    // opacity: 0.4;
    // margin-top: 0;
    // box-shadow: 20px 20px 50px white inset;
  }
  .swiper-button-next {
    padding-right: 136px;
    opacity: 0.5;
  }
  .swiper-button-prev {
    padding-left: 136px;
    opacity: 0.5;
  }
}
.gallery-thumbs {
  // margin-top: -80px;
  height: 20% !important;
  box-sizing: border-box;
  // padding: 5px 0;
}
.gallery-thumbs .swiper-slide {
  width: 74px;
  height: 100%;
  opacity: 0.5;
}
.gallery-thumbs .swiper-slide-active {
  opacity: 1;
}
.gallery-thumbs img {
  border: 2px solid rgb(255, 255, 255);
  height: 34px;
}
.gallery-thumbs img:hover {
  border: 2px solid rgb(0, 0, 255);
}
</style>