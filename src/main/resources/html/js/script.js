$(document).ready(function () {

    var arr_answer = {};
    arr_answer.point ={};
    arr_answer.id = 0;
    arr_answer.id_user = 2;
    arr_answer.name = {};

    $("#send_id").click(function () {
        var id = document.getElementById('id_question').value;
        var get_result = document.getElementById('get-result').style.display = 0;
        var url = "http://localhost:8085/question/get-question-with-variants-of-answers?id=" + id;
        var dt = null;
        $.ajax({
            url: url,
            type: 'GET',
            success:

                function (data) {
                    $.each(data, function(i, item) {
                        $("#test0").html('<p>' + i + '</p>');
                        arr_answer.point[0] = item[0].points;
                        arr_answer.point[1] = item[1].points;
                        arr_answer.point[2] = item[2].points;
                        arr_answer.name[0] = item[0].name;
                        arr_answer.name[1] = item[1].name;
                        arr_answer.name[2] = item[2].name;
                        arr_answer.id = item[0].id_question;
                        $("#test1").html("<input type='radio' name='r1' value='false' id='r_1'/>" +
                                        "<label for='r_1'>" + item[0].name +"</label>");
                        $("#test2").html("<input type='radio' name='r1' value='false' id='r_2'/>" +
                                        "<label for='r_2'>" + item[1].name +"</label>");
                        $("#test3").html("<input type='radio' name='r1' value='false' id='r_3'/>" +
                                        "<label for='r_3'>" + item[2].name +"</label>");

                        // alert(arr_answer.point[0] + "\n" + arr_answer.point[1] + "\n" + arr_answer.point[2] +
                        //     "\n id : " + arr_answer.id + "\n" +
                        //         arr_answer.name[0] + " \n" + arr_answer.name[1] + "\n" + arr_answer.name[2]);
                    });

                    // console.log(data);
                    //
                }
        });
    });

    $("#send-answer").click(function () {

        var rad = document.getElementsByName('r1');
        for (var i=0;i<rad.length; i++) {
            if (rad[i].checked) {
                var url = "http://localhost:8085/answer/insert?id=" + arr_answer.id +
                    "&id_user=" + arr_answer.id_user +
                    "&name=" + arr_answer.name[i] +
                    "&flag=" + true +
                    "&points=" + arr_answer.point[i];
                console.log("Cheked" + i + "radiobutton");
                $.ajax({

                    url : url,
                    type : 'POST',

                    success : function () {
                        console.log("ok!Answer sending!");
                    }

                });
            }
        }

    });

    $('#get-result').click(function () {
        var url = "http://localhost:8085/answer/get-result?id_user=" + arr_answer.id_user;
        $.ajax({

            url : url,
            type : 'GET',

            success : function (data) {
                $.each(data, function(i, item) {
                    $("#result").html(
                        "<p>" + item + "</p>"
                    );
                });
            }

        });

    });


});

