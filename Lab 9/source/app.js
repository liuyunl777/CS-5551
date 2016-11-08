$(document).ready(
    function() {
        $.getJSON(
            "http://127.0.0.1:8081/fish",
            function(response) {
                var intro = response["WikiInfo"][0]["intro"];
                var imageUri = response["FlickrImageUri"][0]["uri"];
                
                $("#result").replaceWith(
                    "<div id = 'result'>" +
                  "<p style = \"color:red;font-size:1.5em;padding-left:1em;padding-top:2em;padding-bottom:1em;\"><u>flickr part</u></p><br>"+
                    "<img src='" +
                    imageUri +
                    "' style = \"padding-left:1em;padding-top:1em;\">" +
                  //  "<p style = \"font-size:1.5em;padding-left:1em;padding-top:2em;padding-bottom:1em;\"><b><u>fish</u></b></p>" +
                 //   "<p align='justify' style = \"padding-left:1em;padding-right:1em;\">" +
                 //   intro +
                 //   "</p>" +
                    "</div>"
                );
                $("#result1").replaceWith(
                    "<div id = 'result1'>" +
                   
                    "<p style = \"color:red;font-size:1.5em;padding-left:1em;padding-top:2em;padding-bottom:1em;\"><b><u>wiki part</u></b><br><b><u>goldfish</u></b></p>" +
                    "<p align='justify' style = \"padding-left:1em;padding-right:1em;\">" +
                    intro +
                    "</p>" +
                    "</div>"
                );
            }
        );
    }
);