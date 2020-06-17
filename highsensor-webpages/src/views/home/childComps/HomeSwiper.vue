<template>
  <div class="home-swiper clear-fix">
    <swiper class="swiper" :options="swiperOption">
      <swiper-slide v-for="item in banners" :key="item.id">
        <img :src="item.image" alt style="width: 100%"/>
      </swiper-slide>
      <div class="swiper-pagination home-pagination" slot="pagination"></div>
      <!-- <div class="swiper-scrollbar" slot="scrollbar"></div> -->
      <div class="swiper-button-prev home-button" slot="button-prev"></div>
      <div class="swiper-button-next home-button" slot="button-next"></div>
    </swiper>
  </div>
</template>
<script>
import { Swiper, SwiperSlide } from "vue-awesome-swiper";
import "swiper/css/swiper.css";
export default {
  name: "home-swiper",
  components: {
    Swiper,
    SwiperSlide
  },
  props: {
    banners: {
      type: Array,
      default() {
        return [];
      }
    }
  },
  data() {
    return {
      swiperOption: {
        effect: "fade", //切换效果
        // effect: "cube",
        centeredSlides: true,
        speed: 1000,
        slidesPerView: 10,
        spaceBetween: 30,
        loop: true,
        pagination: {
          el: ".swiper-pagination.home-pagination",
          clickable: true,
          type: "progressbar",
          // progressbarOpposite: true,
          // progressbarFillClass : 'my-pagination-progressbar-fill',
        },
        // scrollbar: {
        //   el: ".swiper-scrollbar",
        //   hide: true,
        //   // background: "blue",
        // },
        navigation: {
          nextEl: ".swiper-button-next.home-button",
          prevEl: ".swiper-button-prev.home-button"
        },
        autoplay: true
      }
    };
  }
};
</script>

<style lang="less" scoped>
// @import './base.scss';
.home-swiper {
  display: block;
  // margin-top: 100px;
  .swiper-slide {
    display: flex;
    justify-content: center;
    align-items: center;
    text-align: center;
    font-weight: bold;
    background-color: white;
  }
}
</style>