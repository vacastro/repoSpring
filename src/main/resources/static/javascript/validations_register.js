window.onload = function(){

    //detectar cuando toco el boton de registro (se envía el formulario)
     var form = document.getElementById("formulario");
     form.addEventListener('submit', function(event){

      //tomar los datos del formulario
        var nombre =document.getElementById("nombre");
        var email = document.getElementById("email");
        var pass = document.getElementById("password");
        var pass_confirm = document.getElementById("password_confirm");

        var expresion = /\w+@\w+\.+[a-z]/;
        var errores = false;

        //los span de errores del formulario
        var errorNombre = document.querySelector("span.errorNombre");
        var errorEmail = document.querySelector("span.errorEmail");
        var errorPass2= document.querySelector("span.errorContrasenia2");
        var errorPass = document.querySelector("span.errorContrasenia");

      //por cada dato voy a validar
      //campo nombre
         if (nombre.value.trim()== ""){
            errorNombre.innerHTML = "El nombre no puede tener espacios vacíos.";
            nombre.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(nombre.value.length < 3){
            errorNombre.innerHTML = "El nombre debe contener al menos 3 caracteres.";
            nombre.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(nombre.value.length > 40){
            errorNombre.innerHTML = "La extensión del nombre no debe superar los 40 caracteres.";
            nombre.style.border = "2px solid #ffa81c";
            errores = true;
        }else{
            errorNombre.innerHTML = "";
            nombre.style.border = "2px solid #20db93";
          }
          //campo email
          if(!expresion.test(email.value.trim())){
            errorEmail.innerHTML = "El formato no es válido.";
            email.style.border = "2px solid #ffa81c";
            errores = true;
        }else{
            errorEmail.innerHTML = "";
            email.style.border = "2px solid #20db93";
          }


            //campo password
        if(pass.value.trim() == ""){
            errorPass.innerHTML = "";
            errorPass2.innerHTML = "La contraseña es obligatoria.";
            pass.style.border = "2px solid #ffa81c";
            errores = true;
         }else if(pass.value.trim().length < 8){
            errorPass.innerHTML = "";
            errorPass2.innerHTML = "La contraseña debe contener al menos 8 caracteres.";
            pass.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(pass.value.trim().length > 30){
            errorPass.innerHTML = "";
            errorPass2.innerHTML = "La extensión de la contraseña no debe superar los 30 caracteres.";
            pass.style.border = "2px solid #ffa81c";
            errores = true;
        }else if(pass.value.trim() != pass_confirm.value.trim()){
              errorPass.innerHTML = "Las contraseñas deben ser iguales.";
              errorPass2.innerHTML = "Las contraseñas deben ser iguales.";
            pass.style.border = "2px solid #ffa81c";
            pass_confirm.style.border = "2px solid #ffa81c";
            errores = true;
        }else{
            errorPass.innerHTML = "";
            errorPass2.innerHTML = "";
            pass.style.border = "2px solid #20db93";
            pass_confirm.style.border = "2px solid #20db93";
        };

      //si todo esta bien, le doy la bienvenida
      if(errores){
         event.preventDefault();
      };


     });

    };
