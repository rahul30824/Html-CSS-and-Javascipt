<html>
<head>
<style>
body
  
  {
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
    flex-direction:column;
  }
#box
  {
 height:80px;
 width:80px;
 border:2px solid black;
 padding:100px;
  
  }
.buttons
  {
    padding :10px 20px;
  }
.red
  {
    background-color: red;
  }
.green
  {
    background-color: green;
  }
.yellow
  {
    background-color: yellow;
  }
  </style>
  </head>
<body>
  <div id="box"></div>
<div class="buttons">
<button onclick="redcolor()">red</button>
  <button onclick="greencolor()">green</button>
  <button onclick="yellowcolor()">Yellow</button>
  </div>
<script>
function clearColors() {
  let el = document.getElementById("box");
  el.classList.remove("red", "green", "yellow");
}

function redcolor()
  {
    document.getElementById("box").classList.add("red");
  }
function greencolor() {
 
  document.getElementById("box").classList.add("green");
}

function yellowcolor() {

  document.getElementById("box").classList.add("yellow");
}
</script>
  </body>
</html>
