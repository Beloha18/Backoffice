<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@ page import="com.example.ezaka.model.Recharge" %>
<% ArrayList<Recharge> liste = (ArrayList<Recharge>) request.getAttribute("liste"); %>

<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Dashboard - SB Admin</title>
    <link href="/css/styles.css" rel="stylesheet" />
  </head>

  <!DOCTYPE html>
  <html lang="en">
    <head>
      <meta charset="utf-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta
        name="viewport"
        content="width=device-width, initial-scale=1, shrink-to-fit=no"
      />
      <meta name="description" content="" />
      <meta name="author" content="" />
      <title>Static Navigation - SB Admin</title>
      <link href="../../../resources/static/css/styles.css" rel="stylesheet" />
      <script
        src="https://use.fontawesome.com/releases/v6.1.0/js/all.js"
        crossorigin="anonymous"
      ></script>
    </head>
    <body>
      <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
        <!-- Navbar Brand-->
        <a class="navbar-brand ps-3" href="index.html">Start Bootstrap</a>
        <!-- Sidebar Toggle-->
        <button
          class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0"
          id="sidebarToggle"
          href="#!"
        >
          <i class="fas fa-bars"></i>
        </button>
        <!-- Navbar Search-->
        <form
          class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0"
        >
          <div class="input-group">
            <input
              class="form-control"
              type="text"
              placeholder="Search for..."
              aria-label="Search for..."
              aria-describedby="btnNavbarSearch"
            />
            <button class="btn btn-primary" id="btnNavbarSearch" type="button">
              <i class="fas fa-search"></i>
            </button>
          </div>
        </form>
        <!-- Navbar-->
        <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
          <li class="nav-item dropdown">
            <a
              class="nav-link dropdown-toggle"
              id="navbarDropdown"
              href="#"
              role="button"
              data-bs-toggle="dropdown"
              aria-expanded="false"
              ><i class="fas fa-user fa-fw"></i
            ></a>
            <ul
              class="dropdown-menu dropdown-menu-end"
              aria-labelledby="navbarDropdown"
            >
              <li><a class="dropdown-item" href="#!">Settings</a></li>
              <li><a class="dropdown-item" href="#!">Activity Log</a></li>
              <li><hr class="dropdown-divider" /></li>
              <li><a class="dropdown-item" href="#!">Logout</a></li>
            </ul>
          </li>
        </ul>
      </nav>
          </nav>
        </div>
        <div id="layoutSidenav_content">
          <main>
            <div class="container" >
              <div class="row justify-content-center" >
                <div class="col-lg-7" >
                  <div class="card shadow-lg border-0 rounded-lg mt-5" >
                    <div class="card shadow-lg border-0 rounded-lg mt-5" >
                      <div class="card-body">
                        <label for="">liste des demande de recharge</label><br>
                            <table>
                                <% for (int i = 0; i < liste.size(); i++) { %>
                                <tr>
                                
                                    <td><% out.print(liste.get(i).getClient_id_recharge()); %></td>
                                    <td><% out.print(liste.get(i).getRecharge_montant()); %></td>
                                    <td><% out.print(liste.get(i).getRecharge_date()); %></td>
                                    <td>
                                        <form method="post" action="Controller_Recharge">
                                        
                                            <input type="hidden" name="id" value="<% out.print(liste.get(i).getRecharge_id()); %>">
                                            <input type="hidden" name="idclient" value="<% out.print(liste.get(i).getClient_id_recharge()); %>">
                                            <input type="hidden" name="vola" value="<% out.print(liste.get(i).getRecharge_montant()); %>">
                                            <input class="btn btn-primary btn-block" type="submit" name="valider" value="confirmer">
                                            <input class="btn btn-primary btn-block" type="submit" name="valider" value="decliner">
                                        </form>
                                    
                                    </td>
                                </tr>
                                <% }%>
                            </table><br>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </main></br></br></br></br></br></br></br></br></br></br></br></br></br></br></br>
          <footer class="py-4 bg-light mt-auto">
            <div class="container-fluid px-4">
              <div
                class="d-flex align-items-center justify-content-between small"
              >
                <div class="text-muted">Copyright &copy; Your Website 2022</div>
                <div>
                  <a href="#">Privacy Policy</a>
                  &middot;
                  <a href="#">Terms &amp; Conditions</a>
                </div>
              </div>
            </div>
          </footer>
        </div>
      </div>
      <script src="/js/scripts.js"></script>
    </body>
  </html>
</html>
