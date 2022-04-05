package fastcampus.aop.part2.watermelon

data class PlayerModel(
    val playMusicList: List<MusicModel> = emptyList(),
    var currentPosition: Int = -1,
    var isWatchingPlayListView: Boolean = true
) {
    fun getAdapterModels(): List<MusicModel> {
        return playMusicList.mapIndexed { index, musicModel ->
            val newItem = musicModel.copy(
                isPlaying = index == currentPosition
            )
            newItem
        }
    }
}