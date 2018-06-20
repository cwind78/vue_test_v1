<template>
  <div id="app">
    <div class="left_menu">
      <img src="./assets/logo.png">
      <div>
        <router-link :to="{name : 'HelloWorld'}">Home</router-link>
      </div>
      <div>
        <router-link :to="{name : 'Introduce'}">Introduce</router-link>
      </div>
      <div>
        <span class="glyphicon glyphicon-search">Search</span>
      </div>
    </div>
    <div class="right_menu">
      <router-view/>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

router-link {
  margin-bottom:50px;
}

router-view {
  text-align : left;
}

.left_menu {
  height:100%;
  width:20%;
  max-width:200px;
  float:left;
  border-right:1px dotted grey;
}

.right_menu {
  height:100%;
  width:80%;
}
</style>
