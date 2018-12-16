package inkant1990.com.domain.entity.teamProfile

import inkant1990.com.domain.entity.Team

data class TeamProfile(
    val venue: Venue? = null,
    val manager: Manager? = null,
    val players: List<PlayersTeam>? = null,
    val team: Team? = null,
    val statistic: Statistic? = null
)