package com.spongycode.chessapp.util

import com.spongycode.chess_engine.Player
import com.spongycode.chessapp.R
import com.spongycode.chessapp.model.PlayerColor

fun String.getResource(): Int {
    return when (this) {
        "BK" -> R.drawable.bk_1
        "BQ" -> R.drawable.bq_1
        "BR" -> R.drawable.br_1
        "BB" -> R.drawable.bb_1
        "BN" -> R.drawable.bn_1
        "BP" -> R.drawable.bp_1
        "WK" -> R.drawable.wk_1
        "WQ" -> R.drawable.wq_1
        "WR" -> R.drawable.wr_1
        "WB" -> R.drawable.wb_1
        "WN" -> R.drawable.wn_1
        "WP" -> R.drawable.wp_1
        else -> R.drawable.transparent
    }
}

fun Player.toPlayerColor(): PlayerColor {
    return when (this) {
        Player.WHITE -> PlayerColor.WHITE
        Player.BLACK -> PlayerColor.BLACK
        Player.BOTH -> PlayerColor.BOTH
    }
}