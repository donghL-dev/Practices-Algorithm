package programmers.level2;

public class SkillTree {
    public static void main(String[] args) {
        System.out.println(solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
    private static int solution(String skill, String[] skill_trees) {
        int answerCount = 0;

        for (String currentSkill : skill_trees) {
            boolean flag = isCheck(skill, currentSkill);

            if (flag)
                answerCount++;
        }

        return answerCount;
    }

    private static boolean isCheck(String skill, String currentSkill) {
        int currentSkillCount = 0;

        for (int j=0; j<currentSkill.length(); j++) {
            if (skill.contains(String.valueOf(currentSkill.charAt(j)))) {
                currentSkillCount++;
                int skillCount = 0;

                for (int k=0; k<skill.length(); k++) {
                    skillCount++;
                    if (currentSkill.charAt(j) == skill.charAt(k))
                        break;
                }

                if (currentSkillCount != skillCount)
                    return false;
            }
        }

        return true;
    }

}
