<template>
  <div>
    <div>
      {{msg}}
    </div>
    <div>
        <h1>Evnt bus test</h1>
        <search-component></search-component>
        <contents-component></contents-component>
    </div>
  </div>
</template>

<script>
import searchComponent from "./searchComponent.vue"
import contentsComponent from "./contentComponent.vue"

export default {
  name: 'Introduce',
  components : { searchComponent, contentsComponent },
  data () {
    return {
      msg: 'We are future of uracle!!'
    }
  }
}

</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
