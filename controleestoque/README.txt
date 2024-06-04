Sistema Controle De Estoque e Vendas Para Luan Calçados Ltda.
Erick Nathan, Pedro Lucas, Arthur Marques, Rodrigo Gomes.

Para executar o programa sem falhas:

Abra este diretório (luancalcados) no seu NetBeans;
Abra o banco de dados no MySQL Workbench;
O arquivo está em luancalcados/scripts/database;
No Workbench, vá em File>Open SQL Script... e selecione o arquivo database;
Após aberto, execute o script (clicando no raio amarelo na barra de funções);
Execute o programa no NetBeans.

Se você estiver tendo problemas com jdbc.mysql:

Entre em https://dev.mysql.com/downloads/connector/j/ e baixe o ZIP da versão mais recente do Connector/J;
Descompacte o arquivo após baixado e pegue o arquivo .jar dentro da pasta descompactada;
No netbeans, clique no projeto (luancalcados) e vá em Properties;
Na seção "Libraries" vá em "Classpath" e clique em um + ao lado;
Clique em Add JAR/Folder...
Escolha o arquivo connector/j.jar que você pegou após descompactar a pasta;
Clique no aviso em vermelho e clique em "Remove"
Depois aperte em Ok e execute o programa.