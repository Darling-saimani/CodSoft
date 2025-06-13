<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Landing Page</title>
  <link rel="stylesheet" href="amg2.css">
</head>
<body>

  <header>
    <nav>
      <h1>My Landing Page</h1>
      <ul>
        <li><a href="#about">About</a></li>
        <li><a href="#services">Services</a></li>
        <li><a href="#contact">Contact</a></li>
      </ul>
    </nav>
  </header>

  <section class="hero">
    <h2>Welcome to Our Website</h2>
    <p>Build modern web pages using HTML and CSS</p>
    <button onclick="showAlert()">Get Started</button>
  </section>

  <section id="about">
    <h2>About Us</h2>
    <p>This is a demo landing page for beginners using HTML and CSS.</p>
  </section>

  <section id="services">
    <h2>Our Services</h2>
    <div class="card-container">
      <div class="card">Responsive Design</div>
      <div class="card">Clean Code</div>
      <div class="card">SEO Optimized</div>
    </div>
  </section>

  <footer>
    <p>© 2025 MyWebsite. All rights reserved.</p>
  </footer>

  <script src="script.js"></script>
</body>
</html>






 {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }
  
  body {
    font-family: 'Segoe UI', sans-serif;
    line-height: 1.6;
    background-color: #f9f9f9;
  }
  
  header {
    background-color: #111;
    color: #fff;
    padding: 20px 0;
  }
  
  nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 90%;
    margin: auto;
  }
  
  nav ul {
    list-style: none;
    display: flex;
    gap: 20px;
  }
  
  nav a {
    text-decoration: none;
    color: #fff;
  }
  
  .hero {
    background-color: #28a745;
    color: white;
    padding: 100px 20px;
    text-align: center;
  }
  
  .hero button {
    margin-top: 20px;
    padding: 10px 20px;
    background: #fff;
    color: #28a745;
    border: none;
    cursor: pointer;
    font-weight: bold;
  }
  
  section {
    padding: 60px 20px;
    text-align: center;
  }
  
  .card-container {
    display: flex;
    justify-content: center;
    gap: 20px;
    margin-top: 30px;
  }
  
  .card {
    background: #fff;
    padding: 20px;
    border: 1px solid #ccc;
    width: 200px;
    border-radius: 8px;
  }
  
  footer {
    background-color: #111;
    color: #fff;
    text-align: center;
    padding: 20px;
  }
  
