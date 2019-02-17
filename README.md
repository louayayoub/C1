# Introduction	
MongoDB est un système de gestion de bases de données ou SGBD open source dévéloppé par MongoDB Inc depuis 2007,il est comme Mysql ou PostgreSql, mais dont le mécanisme est complètement différent.
Il fait parti de la mouvance NoSQL.Son nom vient de l'anglais "humongus" qui peut être traduit par "énorme". L'objectif est donc de pouvoir gérer de très grandes quantité de données.
Fini le temps ou il fallait créer un schéma de tables relationnelles et créer des requêtes Sql complexes. Grâce à MongoDB vous allez pouvoir stocker vos données un peu comme vous le feriez dans un fichier JSON. C'est à dire, une sorte de dictionnaire géant composé de clés et de valeurs. Ces données peuvent ensuite être exploitées par du javascript, directement intégré dans MongoDB  

  ## Collection et Documents
                     Avant de commencer à voir en détail le fonctionnement de MongoDB, il faut comprendre différentes notions. MongoDB stocke ses données sous le même format qu'un document JSON. Pour être plus exact, c'est la version binaire du JSON appelé BSON. Mais alors, c'est quoi un document JSON ?

### Document 
Un document JSON, c'est simplement un ensemble de clés et de valeurs dont la notation est la suivante :

