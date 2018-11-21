package inkant1990.com.domain.entity.standings

import inkant1990.com.domain.entity.Entity


data class TeamStandings (
    val loss: Int? = null,
    val goalsAgainst: Int? = null,
    val change: Int? = null,
    val rank: Int? = null,
    val draw: Int? = null,
    val played: Int? = null,
    val win: Int? = null,
    val goalDiff: Int? = null,
    val goalsFor: Int? = null,
    val points: Int? = null,
    val name: String? = null,
    val id: String? = null
):Entity