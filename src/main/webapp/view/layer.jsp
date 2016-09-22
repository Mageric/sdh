<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div>
    <p>layer demo</p>
    <button id="msg">layer msg</button>
    <button id="content">layer content</button>
    <button id="iframe">layer iframe</button>
    <button id="loading">layer loading</button>
    <button id="tips">layer tips</button>
</div>
<script type="application/javascript" src="../smeui/plugins/jquery/jquery-3.1.0.min.js"></script>
<script type="application/javascript" src="../smeui/plugins/layer-2.4/layer.js"></script>
<script>
    //layer msg
    $('#msg').on('click', function(){
        layer.msg('Hello layer');
    });

    //layer content
    $('#content').on('click', function(){
        layer.open({
            type: 1,
            area: ['600px', '360px'],
            shadeClose: true,
            content: '\<\div style="padding:20px;">自定义内容\<\/div>'
        });
    });

    //layer iframe
    $('#iframe').on('click', function(){
        layer.open({
            type: 2,
            title: 'iframe父子操作',
            maxmin: false,
            shadeClose: true,
            area : ['600px' , '360px'],
            content: 'http://www.baidu.com'
        });
    });

    //layer lading
    $('#loading').on('click', function(){
        var ii = layer.load();
        //此处用setTimeout演示ajax的回调
        setTimeout(function(){
            layer.close(ii);
        }, 10000);
    });

    //layer tips
    $('#tips').on('click', function(){
        layer.tips('Hello tips!', '#tips');
    });
</script>
</body>
</html>
