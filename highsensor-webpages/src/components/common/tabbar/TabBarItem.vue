<template>
  <div class="tab-bar-item" @click="itemClick">
    <div :style="activeStyle" :class="{ active: isActive}" >
      <slot name="item-text"></slot>
    </div>
  </div>
</template>

<script>
export default {
  name: "TabBarItem",
  props: {
    path: String,
    activeColor: {
      type: String,
      default: "bule"
    },
  },
  data() {
    return {
      
    };
  },
  computed: {
    isActive() {
      return this.$route.path.indexOf(this.path) != -1;
    },
    activeStyle() {
      return this.isActive ? { color: this.activeColor} : {};
    }
  },
  methods: {
    itemClick() {
      this.$router.replace(this.path);
    }
  }
};
</script>

<style scoped>
.tab-bar-item {
  /* flex: 1; */
  text-align: center;
  font-size: 14px;
  padding-left: 50px;
}
.active span {
  padding-bottom: 8px;
  border-bottom: 3px solid #00236e;
}
</style>