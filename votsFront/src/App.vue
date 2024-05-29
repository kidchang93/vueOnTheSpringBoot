
<template>

<router-view/>
</template>

<script>


export default {
  created() {
    const user = sessionStorage.getItem('setUser')
    if (user) {
      console.log('base64 :',user)
      this.$store.commit('setUser',user)
    }
  },
  methods:{
    /*base64(user){
      return JSON.parse(decodeURIComponent(window.atob(user)))
    }*/
  }
}
</script>

<style scoped>

</style>
