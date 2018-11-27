package inkant1990.com.data.entity.mapper

import inkant1990.com.data.db.entity.TeamsDb
import inkant1990.com.data.entity.teamList.TeamListResponse
import inkant1990.com.domain.entity.Team

fun TeamListResponse.transformToDb(): List<TeamsDb> {
    val list = mutableListOf<TeamsDb>()
    groups?.get(0)?.teams?.forEach {

        list.add(TeamsDb(it.name, it.id))
    }
    return list
}

fun TeamListResponse.transformToDomain(): List<Team> {
    val list = mutableListOf<Team>()
    groups?.get(0)?.teams?.forEach {

        list.add(Team(it.name, it.id))
    }
    return list
}

fun TeamsDb.tranform(): Team {
    return Team(name, id)
}