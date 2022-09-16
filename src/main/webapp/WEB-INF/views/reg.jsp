<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="ru">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Форум job4j</title>
</head>
<body>
<div class="container">
    <nav class="navbar navbar-expand-lg navbar-light bg-light mb-4">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <div class="pr-3">
                    <c:if test="${user.username == null}">
                        <a href="<c:url value='/login'/>">Войти</a>
                        <a href="<c:url value='/reg'/>">Регистрация</a>
                    </c:if>
                    <c:if test="${user.username != null}">
                        <a href="<c:url value='/logout'/>">Выйти</a>
                    </c:if>
                </div>
            </div>
        </div>
        <a class="nav-item nav-link">
            Login as : ${user.username}
        </a>
    </nav>
    <div class="mx-auto my-3" style="width: 900px;">
        <div class="card" style="width: 100%">
            <div class="card-header">
                Регистрация
            </div>
            <div class="card-body">
                <c:if test="${not empty errorMessage}">
                    <div class="alert alert-danger" role="alert">
                            ${errorMessage}
                    </div>
                </c:if>
                <form name='login' action="<c:url value='/reg'/>" method='POST'>
                    <div class="form-group pb-3">
                        <label for="username">Имя</label>
                        <input type="text" class="form-control" name="username" id="username">
                    </div>
                    <div class="form-group pb-3">
                        <label for="password">Пароль</label>
                        <input type="password" class="form-control" name="password" id="password">
                    </div>
                    <button type="submit" class="btn btn-outline-primary">Создать</button>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>