package castingTest;


// ���ø���
// �ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
// ����ڰ� ������ ������
// �ִϸ��̼��̶�� "�ڸ�����" ��� ���
// ��ȭ��� "4D" ��� ���
// ��󸶶�� "����" ��� ���

public class CastingTask {
	
	
	public void checkVideo(Video video) {
		if(video instanceof Animation) {
			Animation animation = (Animation) video;
			animation.canSubtitle();
		} else if(video instanceof Film) {
			Film film = (Film) video;
			film.can4D();
		} else if(video instanceof Drama) {
	         Drama drama = (Drama) video;
	         drama.canGoods();
		}
			
		
	}


	public static void main(String[] args) {
		
		Video[] videos = {
	            new Animation(),
	            new Film(),
	            new Drama()
	      };
		
	      CastingTask castingTask = new CastingTask();
	      
	      for (int i = 0; i < videos.length; i++) {
	         castingTask.checkVideo(videos[i]);
	      }

		
		
		
	}
	
	
}