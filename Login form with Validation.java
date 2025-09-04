<!DOCTYPE html>
<html>
<head>
<style>
  .btn button {
    height: 30px;
    width: 350px;
    border-radius: 30px;
    padding: 20px;
    background-color: #0E87CC;
    font-weight: bold;
    color: white;
    border: none;
    cursor: pointer;
  }

  h1 {
    text-align: center;
  }

  body {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background-image: linear-gradient(to right, #ff8177 0%, #ff867a 0%, 
      #ff8c7f 21%, #f99185 52%, #cf556c 78%, #b12a5b 100%);
  }

  .container {
    border: 2px solid black;
    border-radius: 20px;
    padding: 20px;
    background: white;
  }

  input {
    width: 250px;
    padding: 5px;
    border-radius: 10px;
    border: 1px solid #888;
  }

  input::placeholder {
    text-align: center;
  }

  .input label {
    width: 100px;
    display: inline-block;
  }

  .input input {
    margin-bottom: 20px;
    width: 250px;
    border-radius: 20px;
  }
</style>
</head>
<body>
<div class="container">
  <h1>Register</h1>
  <form onsubmit="return checkLogin()">
    <div class="input">
      <label for="email">Email</label>
      <input id="email" type="email" placeholder="Email">
    </div>
    <div class="input">
      <label for="password">Password</label>
      <input id="password" type="password" placeholder="Password">
    </div>
    <div class="btn">
      <button type="submit">Sign-in</button>
    </div>
  </form>
</div>

<script>
  function checkLogin() {
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;

    let validEmail = "test@gmail.com";
    let validPassword = "12345";

    if (email === validEmail && password === validPassword) {
      alert("Login Successful!");
    } else {
      alert("Invalid email or password!");
    }

    return false; // prevents page refresh after submit
  }
</script>
</body>
</html>
