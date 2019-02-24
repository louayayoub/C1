# Introduction	
MongoDB est un système de gestion de bases de données ou [SGBD](https://sql.sh/sgbd) open source dévéloppé par [MongoDB Inc](https://www.mongodb.com/company) depuis 2007,il est comme [Mysql](https://www.mysql.com/fr/) ou [PostgreSql](https://www.postgresql.org/), mais dont le mécanisme est complètement différent.
Il fait parti de la mouvance NoSQL.Son nom vient de l'anglais "humongus" qui peut être traduit par "énorme". L'objectif est donc de pouvoir gérer de très grandes quantité de données.
Fini le temps ou il fallait créer un schéma de tables relationnelles et créer des requêtes Sql complexes. Grâce à MongoDB vous allez pouvoir stocker vos données un peu comme vous le feriez dans un fichier [JSON](https://fr.wikipedia.org/wiki/JavaScript_Object_Notation). C'est à dire, une sorte de dictionnaire géant composé de clés et de valeurs. Ces données peuvent ensuite être exploitées par du [javascript](http://glossaire.infowebmaster.fr/javascript/), directement intégré dans MongoDB  

# Collection et Documents
Avant de commencer à voir en détail le fonctionnement de MongoDB, il faut comprendre différentes notions. MongoDB stocke ses données sous le même format qu'un document JSON. Pour être plus exact, c'est la version binaire du JSON appelé [BSON](https://fr.wikipedia.org/wiki/BSON). Mais alors, c'est quoi un document [JSON](https://fr.wikipedia.org/wiki/JavaScript_Object_Notation) ?

## Document 
Un document [JSON](https://fr.wikipedia.org/wiki/JavaScript_Object_Notation), c'est simplement un ensemble de clés et de valeurs dont la notation est la suivante :
```
{
"first_name": "Richard",
"last_name": "Dawkins",
"job":"ethologist",
"age": 73
}
```
Dans cette exemple, first_name est la clé , Richard est la valeur.
Plusieurs documents peuvent être imbriqués ensemble pour former un documents plus complexe :
```
{
"first_name": "Richard",
"last_name": "Dawkins",
"job":"ethologist",
"age": 73   
address : {
    "street":"33 panda street",
    "city":"Oxford",
    "country":"UK"
    }
}
```
Il est également possible de mettre des listes :
```
{
"first_name": "Richard",
"last_name": "Dawkins",
"job":"ethologist",
"age": 73   
books: [
{"title": "Selfish Gene", "date":"1976"},
{"title": "The blind watchmaker", "date":"1956"},
{"title":"The magic of Reality", date:"2011", "page_count":200}
]
```
Si vous regardez la liste de livres, vous remarquerez qu'il n'est pas nécessaire de respecter la cohérence des champs d'une base Sql. En effet, il y a deux champs title et date pour les deux premiers livres, et 3 pour le dernier.


## Collection

Une collection est tous simplement un ensemble de document. On peut la comparer à une table. Par exemple, une collection de 50 auteurs contiendra 50 documents comme défini plus haut. MongoDB intègre des index notés _id unique pour chaque document.
```
{
"_id" : 0
"first_name": "Richard",
"last_name": "Dawkins",
 },
 {
"_id" : 1
"first_name": "Stephen",
"last_name": "Jay Gould",
 },
 {
"_id" : 2
"first_name": "François",
"last_name": "Jacob",
 },
 .....
 ```
Sachez que le format JSON, provient directement du langage Javascript. D'ailleurs JSON veut dire JavaScript Object Notation. C'est pour cette raison que MongoDB utilise javascript par defaut afin de manipuler sa base.

# Premier pas avec MongoDB
## Installation
si vous êtes sous windows vous pouvez le télécharger depuis ce lien [MongoDB](https://www.mongodb.com/download-center/community), ou
Si vous utilisez Linux Ubuntu, vous pouvez facilement l'installer avec cette commande: 
```sudo apt-get install MongoDB```

### Etape d'installation sous windows




## Lancement du serveur
Sous linux, un daemon est automatiquement crée. Pour l’exécuter :
```sudo /etc/init.d/mongod stop```
Pour les autres, il suffit d’exécuter __mongod__ en spécifiant un chemin de stockage:
```mongod --dbpath C:/mongoData```

