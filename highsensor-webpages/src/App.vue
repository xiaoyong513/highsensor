<template>
  <div id="app">
    <head-nav-bar></head-nav-bar>
    <!-- <keep-alive> -->
      <router-view />
    <!-- </keep-alive> -->
    <Footer />
  </div>
</template>

<script>
import HeadNavBar from "@/components/content/headnavbar/HeadNavBar";
import Footer from "@/components/content/footer/Footer";
export default {
  name: "App",
  data() {
    return {};
  },
  created() {},
  components: {
    HeadNavBar,
    Footer
  },
  mounted() {
    function checkIE() {
      return (
        "-ms-scroll-limit" in document.documentElement.style &&
        "-ms-ime-align" in document.documentElement.style
      );
    }
    if (checkIE()) {
      window.addEventListener(
        "hashchange",
        () => {
          var currentPath = window.location.hash.slice(1);
          if (this.$route.path !== currentPath) {
            this.$router.push(currentPath);
          }
        },
        false
      );
    }
  }
};
</script>

<style>
@import "./assets/css/base.css";
@import "./assets/fa/css/all.min.css";
#app {
  height: 100%;
  position: relative;
}
</style>
