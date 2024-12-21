<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
  <head>
    <meta charset="UTF-8">
    <title>A Pen by  Mynor Alexander</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    
    <link rel="stylesheet" href="css/reset.css">

    
        <link rel="stylesheet" href="css/style.css">

    
    
    
  </head>

  <body>

    <div class="outer-wrap">
  <header class="masthead">
    <div class="sidebar-switcher">
      Select layout: <a href="#" class="sidebar-left-toggle"><i class="fa fa-align-left"></i><span class="screen-reader-text">Move sidebar to the left</span></a> <a href="#" class="sidebar-right-toggle"><i class="fa fa-align-right"></i><span class="screen-reader-text">Move sidebar to the right</span></a> <a href="#" class="no-sidebar-toggle"><i class="fa fa-align-justify"></i><span class="screen-reader-text">Display content vertically</span></a>  <a href="#" class="hide-sidebar-toggle"><i class="fa fa-arrow-circle-right"></i><span class="screen-reader-text">Remove sidebar</span></a>
    </div><!-- .sidebar-switcher -->
    
  <div class="centered">
    <div class="site-branding">
      <h1 class="site-title">Flexbox - Full Site Demo</h1>
    </div><!-- .site-title -->
  </div><!-- .centered -->

    <div class="main-menu">
      <div class="nav-mixed menu">
        <nav id="multi-level-nav" class="multi-level-nav" role="navigation">
          <ul>
            <li><a href="#">Home</a></li>
            <li class="has-children">
              <a href="#">Team<button class="dropdown-toggle" aria-expanded="false"><span class="screen-reader-text">Expand child menu</span></button></a>
              <ul class="sub-menu">
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
              </ul>
            </li>
            <li class="has-children">
              <a href="#">Services<button class="dropdown-toggle" aria-expanded="false"><span class="screen-reader-text">Expand child menu</span></button></a>
              <ul class="sub-menu">
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
                <li><a href="#">Subitem</a></li>
              </ul>
            </li>
            <li><a href="#">About</a></li>
            <li><a href="#">Contact</a></li>
          </ul>
        </nav><!-- #multi-level-nav .multi-level-nav -->

        <nav id="social-menu" class="social-menu" role="navigation">
          <ul>
            <li><a href="https://twitter.com/bugsyAlexander"><span class="screen-reader-text">Twitter</span></a></li>
            <li><a href="https://github.com/bugsyAlexander"><span class="screen-reader-text">Github</span></a></li>
            <li><a href="https://www.linkedin.com/pub/mynor-alexander/5b/943/877"><span class="screen-reader-text">LinkedIn</span></a></li>
            <li><a href="http://dribbble.com"><span class="screen-reader-text">Dribbble</span></a></li>
            <li><a href="http://instagram.com"><span class="screen-reader-text">Instagram</span></a></li>
          </ul>
        </nav> <!-- .social-menu -->
      </div><!-- .mixed-menu -->
      </div><!-- main-menu -->
    </header><!-- .masthead -->

    <div class="content">
      <main class="main-area">
      <div class="centered">
        <section class="cards">
          <article class="card">
            <a href="#">
              <figure class="thumbnail">
                <img src="http://placekitten.com/810/610" alt="meow">
              </figure>
              <div class="card-content">
                <h2>Whiskey</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum explicabo consequatur consectetur fugit molestias perferendis, sint error iste ut, facilis sunt natus optio dolor nesciunt laboriosam obcaecati corporis numquam.</p>
              </div> <!-- .card-content -->
            </a>
          </article><!-- .card -->

          <article class="card">
            <a href="#">
              <figure class="thumbnail">
                <img src="http://placekitten.com/800/610" alt="meow">
              </figure>
              <div class="card-content">
                <h2>Fluffy</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum explicabo consequatur consectetur fugit molestias perferendis, sint error iste ut, facilis sunt natus optio dolor nesciunt laboriosam obcaecati corporis numquam?</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatum explicabo consequatur consectetur fugit molestias perferendis, sint error iste ut, facilis sunt natus optio dolor nesciunt laboriosam obcaecati corporis numquam?</p>
              </div><!-- .card-content -->
            </a>
          </article><!-- .card -->

          <article class="card">
            <a href="#">
              <figure class="thumbnail">
                <img src="http://placekitten.com/816/610" alt="meow">
              </figure>
              <div class="card-content">
                <h2>Kitty</h2>
                <p>  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati recusandae expedita doloribus dicta cumque nostrum, autem eaque soluta atque voluptatem est et, laborum dignissimos error sequi non? Recusandae, aut alias.</p>
              </div><!-- .card-content -->
            </a>
          </article><!-- .card -->

          <article class="card">
            <a href="#">
              <figure class="thumbnail">
                <img src="http://placekitten.com/816/600" alt="meow">
              </figure>
              <div class="card-content">
                <h2>Patches</h2>
                <p>  Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati recusandae expedita doloribus dicta cumque nostrum, autem eaque soluta atque voluptatem est et, laborum dignissimos error sequi non? Recusandae, aut alias.</p>
              </div><!-- .card-content -->
            </a>
          </article><!-- .card -->

          <article class="card">
            <a href="#">
              <figure class="thumbnail">
                <img src="http://placekitten.com/820/620" alt="meow">
              </figure>
              <div class="card-content">
                <h2>Duchess</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati recusandae expedita doloribus dicta cumque nostrum, autem eaque soluta atque voluptatem est et, laborum dignissimos error sequi non? Recusandae, aut alias.</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati recusandae expedita doloribus dicta cumque nostrum, autem eaque soluta atque voluptatem est et, laborum dignissimos error sequi non? Recusandae, aut alias.</p>
              </div><!-- .card-content -->
            </a>
          </article><!-- .card -->

          <article class="card">
            <a href="#">
              <figure class="thumbnail">
                <img src="http://placekitten.com/810/610" alt="meow">
              </figure>
              <div class="card-content">
                <h2>Puchies</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati recusandae expedita doloribus dicta cumque nostrum, autem eaque soluta atque voluptatem est et, laborum dignissimos error sequi non? Recusandae, aut alias.</p>
              </div><!-- .card-content -->
            </a>
          </article><!-- .card -->

          <article class="card">
            <a href="#">
              <figure class="thumbnail">
                <img src="http://placekitten.com/808/608" alt="meow">
              </figure>
              <div class="card-content">
                <h2>Panchito</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati recusandae expedita doloribus dicta cumque nostrum, autem eaque soluta atque voluptatem est et, laborum dignissimos error sequi non? Recusandae, aut alias.</p>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Obcaecati recusandae expedita doloribus dicta cumque nostrum, autem eaque soluta atque voluptatem est et, laborum dignissimos error sequi non? Recusandae, aut alias.</p>
              </div><!-- .card-content -->
            </a>
          </article><!-- .card -->

        </section><!-- .cards -->
      </div><!-- .centered -->
      </main><!-- main-area -->

      <div class="sidebar">
        <div class="squish-container">
          <h3>Explore the other Demos:</h3>
          <nav class="example-menu">
            <ul>
              <li><a href="http://codepen.io/bugsyAlexander/pen/xGBaaG" target="_blank">Mixed Menu</a></li>
              <li><a href="http://codepen.io/bugsyAlexander/pen/gpyYOo" target="_blank">Card Layout</a></li>
              <li><a href="http://codepen.io/bugsyAlexander/pen/OVGLmo" target="_blank">Holy Grail</a></li>
              <li><a href="http://codepen.io/bugsyAlexander/pen/xGNZao" target="_blank">Site Demo</a></li>
            </ul>
          </nav><!-- .example-menu -->
        </div>
      </div><!-- .sidebar -->
    </div><!-- .content -->

  <footer class="footer-area">
    <p>&copy; 2015 Some copyright message - All rights reserved</p>
  </footer>
</div><!-- .outer-wrap -->
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

    
    
    
  </body>
</html>
