import domain.Movie;
import domain.MovieRepository;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Scanner;

public class MovieApplication {
    public static void main(String[] args) {
        List<Movie> movies = MovieRepository.getMovies();
        OutputView.printMovies(movies);

        int movieId = InputView.inputMovieId();
        OutputView.PrintChoiceMovie(movies, movieId);
        int ChoiceScheduleNum = ChoicePlaySchedule();
        int ChoicePeopleNum = ChoicePeopleNumber();

        ExitOrMore();;
        // TODO 구현 진행
    }

    public static int ChoicePlaySchedule()
    {
        int Choice_PlaySchedule ;
        Scanner sc = new Scanner(System.in);
        System.out.println("##예약할 시간표를 선택하세요.(첫번째 상영 시간이 1번)");
        Choice_PlaySchedule = sc.nextInt();
        return Choice_PlaySchedule;
    }

    public static int ChoicePeopleNumber()
    {
        int Choice_PeopleNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("## 예약할 인원을 입력하세요");
        Choice_PeopleNum=sc.nextInt();
        return Choice_PeopleNum;
    }
    public static void ExitOrMore()
    {
        int Choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("##예약을 종료하고 결제를 진행하려면 1번, 추가 예약을 진행하려면 2번");
        Choice = sc.nextInt();
        if(Choice==1)
            PrintReservation();
        if(Choice==2)
            MoreReservation();
    }

}

