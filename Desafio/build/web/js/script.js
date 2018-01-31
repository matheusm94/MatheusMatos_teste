   function validaCampos(){
            var nome = document.getElementById("nome").value;
                
	                if (nome == "" || nome.length < 2){
                        alert("Preencha o nome");
		                  document.getElementById("nome").focus();
		                      return false;

                    }

            var cpf = document.getElementById("cpf").value;
                    if (cpf.length <9 || cpf.length > 9){
                        alert("Preencha o cpf");
                          document.getElementById("cpf").focus;
                             return false;
                        
                    }

            
        }