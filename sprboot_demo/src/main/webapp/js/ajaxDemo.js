$(function(){
    $("#search-form").submit(function(event){
        event.preventDefault();
        ajax_submit();
    });
})


function ajax_submit(){
    var search = {
        name: 125
    };
    // search.name = $("#username").val();

    $("#bth-search").prop("diabled", true);

    alert(search.name);

     /*$.ajax(
        type: "post",
        // contentType: "application/json",
        url: "http://localhost:8080/api/search",
        data: JSON.stringify(search),
        // dataType: 'json',
        cache: false,
        timeout: 60000,
        success: function (data) {
            alert(data);
            /!*var json = "<h4>Ajax Reponse</h4><pre>" +
                JSON.stringify(data, null, 4)+"</pre>";
            $("#feedback").html(json);
            console.log("success: ", data);
            $("#bth-search").prop("diabled", false);*!/
         }
        /!*error: function(e){
             var json = "<h4>Ajax Response</h4><pre>"
                 + e.responseText + "</pre>";
             $('#feedback').html(json);
             console.log("ERROR : ", e);
             $("#btn-search").prop("disabled", false);
         }*!/
    );*/
}
