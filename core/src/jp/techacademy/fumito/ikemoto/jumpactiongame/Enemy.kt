package jp.techacademy.fumito.ikemoto.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Enemy(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight)
{
    companion object {
        // 横幅、高さ
        val Enemy_WIDTH = 1.0f
        val Enemy_HEIGHT = 1.0f
    }

    init {
        setSize(Enemy_WIDTH, Enemy_HEIGHT)
    }
}