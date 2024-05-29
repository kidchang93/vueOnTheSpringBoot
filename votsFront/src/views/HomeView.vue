

<template>
  <div class="home">
    <a href="/user">사용자 목록</a>
  <button @click="getData">데이터 호출</button>
  </div>

</template>

<script>
import axios from 'axios'
const uForm = {no:1, name:'홍길동', email:'gildong@naver.com', pwd:'1234', gender:"true"}
const params = {
  params : {no: 1}
}
export default {
  name: 'HomeView',
  methods:{

    // CRUD 구문
    getData(){
      axios
        .put('http://localhost:8080/save',uForm)
        .then((response) => {
          console.log(response)
        })
        .catch(error => {
          console.log(error)
        })
    }

  }
}
</script>

<style scoped>
a {
  color: black;
  text-decoration: none;
  font-weight: bold;
  font-size: 1.5rem;
}
</style>