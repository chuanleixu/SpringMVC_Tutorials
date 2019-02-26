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

</body>
</html>
