<html>
<body>

    <a href="/springmvc/helloworld">hello world</a>


    <br><br>


    <form action="/springmvc/testMethod" method="post">
        <button value="submit">testMethod</button>

    </form>

    <br><br>

    <a href="/springmvc/testParamsAndHeaders?username=chengdu&age=10">testParamsAndHeaders</a>

    <br><br>

    <a href="/springmvc/testPathVariable/1">testPathVariable</a>

    <br><br>

    <a href="/springmvc/testRest/1">Test Rest Get</a>

    <br><br>

    <form action="/springmvc/testRest" method="post">
        <input type="submit" value="TestRest POST">
    </form>

    <br><br>

    <form action="/springmvc/testRest/1" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <input type="submit" value="TestRest DELETE">
    </form>

    <br><br>

    <form action="/springmvc/testRest/1" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="submit" value="TestRest PUT">
    </form>

    <br><br>

    <a href="/springmvc/testRequestParam?username=wend&age=10">testRequestParam</a>

    <br><br>

    <a href="/springmvc/testRequestHeader">testRequestHeader</a>

    <br><br>

    <a href="/springmvc/testCookieValue">testCookieValue</a>

    <br><br>

    <form action="/springmvc/testPojo" method="post">
        username:<input type="text" name="username">
        <br>
        password:<input type="password" name="password">
        <br>
        email:<input type="text" name="email">
        <br>
        age:<input type="text" name="age">
        <br>
        city:<input type="text" name="address.city">
        <br>
        province:<input type="text" name="address.province">
        <br>
        <input type="submit" value="Submit">
    </form>

</body>
</html>
