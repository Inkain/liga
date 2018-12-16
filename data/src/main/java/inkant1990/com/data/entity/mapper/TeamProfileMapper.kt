package inkant1990.com.data.entity.mapper

import inkant1990.com.data.entity.teamProfile.Response
import inkant1990.com.domain.entity.Team
import inkant1990.com.domain.entity.teamProfile.PlayersTeam
import inkant1990.com.domain.entity.teamProfile.Statistic
import inkant1990.com.domain.entity.teamProfile.TeamProfile
import inkant1990.com.domain.entity.teamProfile.Venue

fun Response.transformToDomain(): TeamProfile {
    val manager = inkant1990.com.domain.entity.teamProfile.Manager(
        manager?.countryCode,
        manager?.nationality,
        manager?.name,
        manager?.id
    )
    val teamPlayers: MutableList<PlayersTeam> = mutableListOf()
    players?.forEach {
        if (it != null) {
            teamPlayers.add(
                PlayersTeam(
                    it.nationality,
                    it.dateOfBirth,
                    it.name,
                    it.preferredFoot,
                    it.weight,
                    it.jerseyNumber,
                    it.type,
                    it.height
                )
            )
        }
    }
    val venues = Venue(venue?.countryCode, venue?.cityName, venue?.name, venue?.countryName, venue?.capacity)
    val statistic = Statistic(
        statistics?.seasons?.last()?.statistics?.matchesPlayed,
        statistics?.seasons?.last()?.statistics?.goalsScored,
        statistics?.seasons?.last()?.statistics?.matchesLost,
        statistics?.seasons?.last()?.statistics?.groupPosition,
        statistics?.seasons?.last()?.statistics?.matchesWon,
        statistics?.seasons?.last()?.statistics?.goalsConceded,
        statistics?.seasons?.last()?.statistics?.matchesDrawn,
        statistics?.seasons?.last()?.statistics?.groupName
    )
    val teams = Team(team?.name, team?.id, team?.abbreviation)


    return TeamProfile(venues, manager, teamPlayers, teams, statistic)
}