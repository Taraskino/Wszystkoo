package Laboratorium15;

abstract public  class MusicPlayer implements Player {
    private Song[] library;
    private int current;

    public MusicPlayer(Song[] library) {
        this.library = library;
    }

    public Song getCurrentSong(){
        return library[current];
    }
    @Override
    public void next() {
        if(++current >= library.length){
            current = 0;
        }
        play();
    }
    @Override
    public void previous() {
        if(--current < 0){
            current = library.length - 1;
        }
        play();
    }
}
