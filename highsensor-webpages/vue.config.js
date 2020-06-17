module.exports = {
  configureWebpack: {
    resolve: {
      alias: {
        'assets': '@/assets',
        'common': '@/common',
        'network': '@/network',
        'components': '@/components',
      }
    }
  },
  // chainWebpack: config => {
  //   config.rule('js').include.add(/node_modules\/(dom7|swiper)\/.*/)
  // },
  // transpileDependencies: ['iview', 'router']
}