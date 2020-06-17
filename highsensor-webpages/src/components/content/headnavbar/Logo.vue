<template>
  <div class="logo">
    <div class="nav-logo">
      <img src="@/assets/img/common/logo.png" alt />
    </div>
    <div class="nav-logo-title">
      <div class="nav-logo-title-zh">
        <img src="@/assets/img/common/title-zh.png" alt />
      </div>
      <div class="nav-logo-title-en">
        <img src="@/assets/img/common/title-en.png" alt />
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Logo",
  components: {},
  data() {
    return {};
  },
  computed: {},
  created() {},
  methods: {}
};
</script>

<style scoped>
.logo {
  position: relative;
  display: flex;
}
.nav-logo-title {
  display: block;
  padding-left: 10px;
  padding-top: 10px;
  /* flex: 1; */
}
</style>