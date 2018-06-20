<template>
  <div class="form-group row">
    <div class="form-group has-feedback text-right">
        <input type="text" class="form-control" v-model='todo' @keyup.enter='addTodo()' id="inputValidation" placeholder="New to do"/>
    </div>
  </div>
</template>

<script>
import eventBus from './EventBus.vue'

export default {
  name : "search-component",
  data : function() {
    return { todo : ""};
  },
  methods : {
    addTodo : function() {
      if (this.todo.length > 0) {
        eventBus.$emit("add", this.todo);
      }
    }
  }
}

</script>

<style>
</style>