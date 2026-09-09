package com.convoca.core.designsystem.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class StatusColors(
    val paid: Color, val onPaid: Color,
    val pending: Color, val onPending: Color,
    val refused: Color, val onRefused: Color,
    val live: Color,
)

val statusLight = StatusColors(
    paid = Color(0xFFB2F0BC), onPaid = Color(0xFF00210E),
    pending = Color(0xFFFFDCC0), onPending = Color(0xFF2C1600),
    refused = Color(0xFFFFDAD6), onRefused = Color(0xFF410002),
    live = Color(0xFFE53935),
)
val statusDark = StatusColors(
    paid = Color(0xFF14522A), onPaid = Color(0xFFB2F0BC),
    pending = Color(0xFF693C00), onPending = Color(0xFFFFDCC0),
    refused = Color(0xFF93000A), onRefused = Color(0xFFFFDAD6),
    live = Color(0xFFFF6B66),
)

val LocalStatusColors = staticCompositionLocalOf { statusLight }
