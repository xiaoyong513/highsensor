<template>
  <div id="tab-bar">
    <slot></slot>
  </div>
</template>
<script>
export default {
  name: "TabBar"
};
</script>
<style scoped>
#tab-bar {
  height: 100px; 
  /* background-color: #ddd; */
  display: flex;
  position: relative;
  justify-content: center;
  align-items: center;
  /* left: 0;
  right: 0;
  top: 0; */
}
</style>