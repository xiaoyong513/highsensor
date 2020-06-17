import Vue from 'vue'
import Router from 'vue-router'

// const Home = () => import('@/views/home/Home')
// const Icoach = () => import('@/views/icoach/Icoach')
// const Solution = () => import('@/views/solution/Solution')
// const Product = () => import('@/views/product/Product')
// const Contact = () => import('@/views/contact/Contact')
import Home from '@/views/home/Home'
import Icoach from '@/views/icoach/Icoach'
import Solution from '@/views/solution/Solution'
import Product from '@/views/product/Product'
import Contact from '@/views/contact/Contact'

Vue.use(Router)
const routes = [
  {
    path: "",
    redirect: "/home"
  },
  {
    path: "/home",
    component: Home
  },
  {
    path: "/icoach",
    component: Icoach
  },
  {
    path: "/solution",
    component: Solution
  },
  {
    path: "/product",
    component: Product
  },
  {
    path: "/contact",
    component: Contact
  }
]
export default new Router({
  routes,
  // mode: 'history'
})