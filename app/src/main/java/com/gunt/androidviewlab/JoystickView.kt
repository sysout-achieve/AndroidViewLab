package com.gunt.androidviewlab

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class JoystickView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private val innerPaint by lazy { Paint() }
    private val outterPaint by lazy { Paint() }

    var positionX = 300f
    var positionY = 300f

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        outterPaint.color = Color.BLACK
        outterPaint.style = Paint.Style.STROKE
        canvas?.drawCircle(300f, 300f, 300f, outterPaint)


        innerPaint.color = Color.RED
        canvas?.drawCircle(positionX, positionY, 80F, innerPaint)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE -> {
                positionX = event.x
                positionY = event.y
            }
            MotionEvent.ACTION_UP -> {
                positionX = 300f
                positionY = 300f
            }
        }
        invalidate()
        return true
    }
}