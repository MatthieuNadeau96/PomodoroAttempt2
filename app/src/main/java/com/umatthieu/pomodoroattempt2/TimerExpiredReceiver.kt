package com.umatthieu.pomodoroattempt2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.umatthieu.pomodoroattempt2.util.NotificationUtil
import com.umatthieu.pomodoroattempt2.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
