# world-cup-java-spring-rest-crud

Popualating database:

curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstTeam\" : \"Russia\",  \"secondTeam\" : \"Uruguay\",  \"firstTeamScore\" : 0,  \"secondTeamScore\" : 3 }" http://localhost:8080/match
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstTeam\" : \"France\",  \"secondTeam\" : \"Argentina\",  \"firstTeamScore\" : 4,  \"secondTeamScore\" : 3 }" http://localhost:8080/match
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstTeam\" : \"Panama\",  \"secondTeam\" : \"Tunisia\",  \"firstTeamScore\" : 1,  \"secondTeamScore\" : 2 }" http://localhost:8080/match
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstTeam\" : \"Senegal\",  \"secondTeam\" : \"Colombia\",  \"firstTeamScore\" : 0,  \"secondTeamScore\" : 1 }" http://localhost:8080/match
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstTeam\" : \"Uruguay\",  \"secondTeam\" : \"Portugal\",  \"firstTeamScore\" : 2,  \"secondTeamScore\" : 1 }" http://localhost:8080/match