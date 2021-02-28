package com.gunt.androidviewlab

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class JoystickView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private val innerPaint by lazy { Paint() }
    private val outterPaint by lazy { Paint() }

    var positionX = 100f
    var positionY = 100f

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        outterPaint.color = Color.BLACK
        outterPaint.style = Paint.Style.STROKE
        canvas?.drawCircle(100f, 100f, 100F, outterPaint)


        innerPaint.color = Color.RED
        canvas?.drawCircle(positionX, positionY, 50F, innerPaint)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                positionX = event.x
                positionY = event.y
                invalidate()
            }
            MotionEvent.ACTION_MOVE -> {

            }
            MotionEvent.ACTION_UP -> {

            }
            else ->{

            }
        }

        return true
    }
}