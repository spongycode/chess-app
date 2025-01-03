package com.spongycode.chessapp.model

data class Game(
    val player1: String? = null,
    val player2: String? = null,
    val player1Color: String? = null,
    val moves: List<Move>? = listOf(),
    val status: String? = null,
    val requestStatus: String? = null,
    val createdAt: Long? = 0L,
    val updatedAt: Long? = 0L,
    val whitePlayerTimeLeft: Int = 600,
    val blackPlayerTimeLeft: Int = 600
)

data class Move(
    val from: String = "",
    val to: String = ""
)

enum class PlayerColor {
    WHITE,
    BLACK,
    BOTH
}